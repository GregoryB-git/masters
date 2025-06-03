.class public final Leb/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Leb/m;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Leb/m;

    const/4 v1, 0x2

    new-array v1, v1, [Leb/l;

    new-instance v2, Leb/j$a;

    invoke-direct {v2}, Leb/j$a;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Leb/j$b;->a:Leb/j$b;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Leb/m;-><init>([Leb/l;)V

    sput-object v0, Leb/m;->b:Leb/m;

    return-void
.end method

.method public varargs constructor <init>([Leb/l;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Leb/m;->a:Ljava/util/concurrent/ConcurrentHashMap;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    iget-object v3, p0, Leb/m;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2}, Leb/l;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

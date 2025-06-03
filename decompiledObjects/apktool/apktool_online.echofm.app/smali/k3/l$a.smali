.class public Lk3/l$a;
.super Lk3/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/l;->b(Lk3/l$b;Ljava/lang/Class;Ljava/lang/Class;)Lk3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lk3/l$b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lk3/l$b;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lk3/l$a;->c:Lk3/l$b;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lk3/l;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lk3/l$a;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a(Lc3/g;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk3/l$a;->c:Lk3/l$b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lk3/l$b;->a(Lc3/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

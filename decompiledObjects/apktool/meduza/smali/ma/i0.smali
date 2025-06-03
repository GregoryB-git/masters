.class public abstract Lma/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lma/i0$b;,
        Lma/i0$a;
    }
.end annotation


# static fields
.field public static final a:Lma/i0$a;

.field public static final b:Lma/i0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lma/i0$a;

    invoke-direct {v0}, Lma/i0$a;-><init>()V

    sput-object v0, Lma/i0;->a:Lma/i0$a;

    new-instance v0, Lma/i0$b;

    invoke-direct {v0}, Lma/i0$b;-><init>()V

    sput-object v0, Lma/i0;->b:Lma/i0$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)V
.end method

.method public abstract b(Ljava/lang/Object;JLjava/lang/Object;)V
.end method

.method public abstract c(Ljava/lang/Object;J)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J)",
            "Ljava/util/List<",
            "T",
            "L;",
            ">;"
        }
    .end annotation
.end method

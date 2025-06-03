.class public final Lb/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldc/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/a<",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;

.field public c:Z

.field public final d:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lb/j$i;Lb/e;)V
    .locals 1

    const-string v0, "executor"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb/n;->a:Ldc/a;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/n;->b:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb/n;->d:Ljava/util/ArrayList;

    return-void
.end method

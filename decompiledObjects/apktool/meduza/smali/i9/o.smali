.class public final Li9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(IZLt8/e;Lt8/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Lt8/e<",
            "Lj9/i;",
            ">;",
            "Lt8/e<",
            "Lj9/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li9/o;->a:I

    iput-boolean p2, p0, Li9/o;->b:Z

    iput-object p3, p0, Li9/o;->c:Lt8/e;

    iput-object p4, p0, Li9/o;->d:Lt8/e;

    return-void
.end method

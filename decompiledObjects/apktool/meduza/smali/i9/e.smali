.class public final Li9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/e$a;
    }
.end annotation


# static fields
.field public static final f:J

.field public static final g:J


# instance fields
.field public final a:Li9/e$a;

.field public final b:Le9/a;

.field public final c:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Li9/f;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Li9/h;",
            ">;"
        }
    .end annotation
.end field

.field public e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xf

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Li9/e;->f:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Li9/e;->g:J

    return-void
.end method

.method public constructor <init>(Le9/a;Ln9/a;Li9/n;)V
    .locals 3

    new-instance v0, Laa/m0;

    const/4 v1, 0x1

    invoke-direct {v0, p3, v1}, Laa/m0;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Ld;

    const/4 v2, 0x2

    invoke-direct {v1, p3, v2}, Ld;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p3, 0x32

    iput p3, p0, Li9/e;->e:I

    iput-object p1, p0, Li9/e;->b:Le9/a;

    new-instance p1, Li9/e$a;

    invoke-direct {p1, p0, p2}, Li9/e$a;-><init>(Li9/e;Ln9/a;)V

    iput-object p1, p0, Li9/e;->a:Li9/e$a;

    iput-object v0, p0, Li9/e;->c:Ln7/q;

    iput-object v1, p0, Li9/e;->d:Ln7/q;

    return-void
.end method

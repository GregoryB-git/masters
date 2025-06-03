.class public final Li9/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/q$b;,
        Li9/q$a;,
        Li9/q$d;,
        Li9/q$c;
    }
.end annotation


# static fields
.field public static final c:J

.field public static final d:J

.field public static final synthetic e:I


# instance fields
.field public final a:Li9/p;

.field public final b:Li9/q$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    sput-wide v1, Li9/q;->c:J

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Li9/q;->d:J

    return-void
.end method

.method public constructor <init>(Li9/p;Li9/q$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/q;->a:Li9/p;

    iput-object p2, p0, Li9/q;->b:Li9/q$b;

    return-void
.end method

.class public final Lo9/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/concurrent/TimeUnit;


# instance fields
.field public a:J

.field public b:Ljava/util/concurrent/TimeUnit;

.field public final c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sput-object v0, Lo9/m;->d:Ljava/util/concurrent/TimeUnit;

    return-void
.end method

.method public constructor <init>(Lo9/o;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x46

    iput-wide v0, p0, Lo9/m;->a:J

    sget-object v0, Lo9/m;->d:Ljava/util/concurrent/TimeUnit;

    iput-object v0, p0, Lo9/m;->b:Ljava/util/concurrent/TimeUnit;

    iget-boolean p1, p1, Lo9/o;->a:Z

    iput-boolean p1, p0, Lo9/m;->c:Z

    return-void
.end method

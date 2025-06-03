.class public final synthetic Lm0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lm0/x$a;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:J

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lm0/x$a;Ljava/lang/String;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/r;->o:Lm0/x$a;

    .line 5
    .line 6
    iput-object p2, p0, Lm0/r;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lm0/r;->q:J

    .line 9
    .line 10
    iput-wide p5, p0, Lm0/r;->r:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lm0/r;->o:Lm0/x$a;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/r;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v2, p0, Lm0/r;->q:J

    .line 6
    .line 7
    iget-wide v4, p0, Lm0/r;->r:J

    .line 8
    .line 9
    invoke-static/range {v0 .. v5}, Lm0/x$a;->k(Lm0/x$a;Ljava/lang/String;JJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

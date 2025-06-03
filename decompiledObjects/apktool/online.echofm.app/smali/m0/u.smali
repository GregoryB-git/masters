.class public final synthetic Lm0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lm0/x$a;

.field public final synthetic p:J


# direct methods
.method public synthetic constructor <init>(Lm0/x$a;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/u;->o:Lm0/x$a;

    .line 5
    .line 6
    iput-wide p2, p0, Lm0/u;->p:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/u;->o:Lm0/x$a;

    .line 2
    .line 3
    iget-wide v1, p0, Lm0/u;->p:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Lm0/x$a;->e(Lm0/x$a;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

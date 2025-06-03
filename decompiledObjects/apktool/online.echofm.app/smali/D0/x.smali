.class public final synthetic LD0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LD0/E$a;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(LD0/E$a;Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD0/x;->o:LD0/E$a;

    .line 5
    .line 6
    iput-object p2, p0, LD0/x;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, LD0/x;->q:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LD0/x;->o:LD0/E$a;

    .line 2
    .line 3
    iget-object v1, p0, LD0/x;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-wide v2, p0, LD0/x;->q:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, LD0/E$a;->j(LD0/E$a;Ljava/lang/Object;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

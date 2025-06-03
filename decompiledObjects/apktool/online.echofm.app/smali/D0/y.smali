.class public final synthetic LD0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LD0/E$a;

.field public final synthetic p:J

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(LD0/E$a;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD0/y;->o:LD0/E$a;

    .line 5
    .line 6
    iput-wide p2, p0, LD0/y;->p:J

    .line 7
    .line 8
    iput p4, p0, LD0/y;->q:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LD0/y;->o:LD0/E$a;

    .line 2
    .line 3
    iget-wide v1, p0, LD0/y;->p:J

    .line 4
    .line 5
    iget v3, p0, LD0/y;->q:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, LD0/E$a;->g(LD0/E$a;JI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

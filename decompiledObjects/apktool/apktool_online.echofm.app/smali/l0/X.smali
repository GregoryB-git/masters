.class public final synthetic Ll0/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/n$a;


# instance fields
.field public final synthetic a:Ll0/c$a;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ll0/c$a;IJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll0/X;->a:Ll0/c$a;

    .line 5
    .line 6
    iput p2, p0, Ll0/X;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, Ll0/X;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, Ll0/X;->d:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ll0/X;->a:Ll0/c$a;

    .line 2
    .line 3
    iget v1, p0, Ll0/X;->b:I

    .line 4
    .line 5
    iget-wide v2, p0, Ll0/X;->c:J

    .line 6
    .line 7
    iget-wide v4, p0, Ll0/X;->d:J

    .line 8
    .line 9
    move-object v6, p1

    .line 10
    check-cast v6, Ll0/c;

    .line 11
    .line 12
    invoke-static/range {v0 .. v6}, Ll0/s0;->q1(Ll0/c$a;IJJLl0/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

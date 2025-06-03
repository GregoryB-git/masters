.class public final synthetic LT3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/g;


# instance fields
.field public final synthetic a:LT3/n;

.field public final synthetic b:J

.field public final synthetic c:LV2/j;

.field public final synthetic d:LV2/j;


# direct methods
.method public synthetic constructor <init>(LT3/n;JLV2/j;LV2/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT3/k;->a:LT3/n;

    .line 5
    .line 6
    iput-wide p2, p0, LT3/k;->b:J

    .line 7
    .line 8
    iput-object p4, p0, LT3/k;->c:LV2/j;

    .line 9
    .line 10
    iput-object p5, p0, LT3/k;->d:LV2/j;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, LT3/k;->a:LT3/n;

    .line 2
    .line 3
    iget-wide v1, p0, LT3/k;->b:J

    .line 4
    .line 5
    iget-object v3, p0, LT3/k;->c:LV2/j;

    .line 6
    .line 7
    iget-object v4, p0, LT3/k;->d:LV2/j;

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    check-cast v5, Ljava/lang/Void;

    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, LT3/n;->t(LT3/n;JLV2/j;LV2/j;Ljava/lang/Void;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

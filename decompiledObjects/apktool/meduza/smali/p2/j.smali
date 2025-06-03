.class public final Lp2/j;
.super Lq1/b;
.source "SourceFile"


# static fields
.field public static final c:Lp2/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp2/j;

    invoke-direct {v0}, Lp2/j;-><init>()V

    sput-object v0, Lp2/j;->c:Lp2/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lq1/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(Lu1/c;)V
    .locals 1

    const-string v0, "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    "

    invoke-virtual {p1, v0}, Lu1/c;->m(Ljava/lang/String;)V

    return-void
.end method

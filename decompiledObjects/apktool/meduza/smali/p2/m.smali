.class public final Lp2/m;
.super Lq1/b;
.source "SourceFile"


# static fields
.field public static final c:Lp2/m;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp2/m;

    invoke-direct {v0}, Lp2/m;-><init>()V

    sput-object v0, Lp2/m;->c:Lp2/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x7

    const/16 v1, 0x8

    invoke-direct {p0, v0, v1}, Lq1/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(Lu1/c;)V
    .locals 1

    const-string v0, "\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    "

    invoke-virtual {p1, v0}, Lu1/c;->m(Ljava/lang/String;)V

    return-void
.end method

.class public final synthetic Lw2/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/i;


# static fields
.field public static final synthetic a:Lw2/B;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw2/B;

    .line 2
    .line 3
    invoke-direct {v0}, Lw2/B;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw2/B;->a:Lw2/B;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LV2/j;
    .locals 0

    .line 1
    check-cast p1, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-static {p1}, Lw2/c;->b(Landroid/os/Bundle;)LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

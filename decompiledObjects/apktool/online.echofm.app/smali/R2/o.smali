.class public final synthetic LR2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR2/s;


# static fields
.field public static final synthetic a:LR2/o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR2/o;

    .line 2
    .line 3
    invoke-direct {v0}, LR2/o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR2/o;->a:LR2/o;

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
.method public final a(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, LR2/p;->J(Landroid/database/Cursor;)LR2/q3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
